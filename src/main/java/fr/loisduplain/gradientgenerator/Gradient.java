package fr.loisduplain.gradientgenerator;

import lombok.Getter;
import lombok.Setter;

import java.awt.Color;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Gradient {

    @Getter @Setter private List<Color> colors;

    public Gradient(ArrayList<Color> colors) {
        this.colors = colors;
    }
    public Gradient(Color... colors) {
        this.colors = new ArrayList<>(Arrays.stream(colors).toList());
    }
    public Gradient() {
        this.colors = new ArrayList<>();
    }

    public Color getColor(float value, float maxValue) {
        if (colors.size() == 0)
            colors.add(new Color(255, 255, 255));
        if (colors.size() == 1)
            colors.add(new Color(0, 0, 0));

        value /= maxValue / (float)(colors.size() - 1);

        return lerpColor(
                colors.get((int)value),
                colors.get((int)value + 1),
                value - (int)value,
                1);
    }
    private Color lerpColor(Color start, Color end, float step, float maxStep) {
        float rStep = (end.getRed() - start.getRed()) / maxStep;
        float gStep = (end.getGreen() - start.getGreen()) / maxStep;
        float bStep = (end.getBlue() - start.getBlue()) / maxStep;

        return new Color(start.getRed() + (int)(rStep * step),
                start.getGreen() + (int)(gStep * step),
                start.getBlue() + (int)(bStep * step));
    }

}
