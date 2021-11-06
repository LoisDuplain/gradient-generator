<h1 align="center">🍭 gradient-generator 🎨</h1>

<p align="center">
  <a href="https://fr.wikipedia.org/wiki/MacOS_Mojave" target="_blank">
    <img alt="java version: 16" src="https://img.shields.io/badge/java-16-red?style=flat-square"/>
  </a>
  <a href="https://fr.wikipedia.org/wiki/C_(langage)" target="_blank">
    <img alt="language: java" src="https://img.shields.io/badge/language-Java-purple?style=flat-square"/>
  </a>
  <a href="https://profile.intra.42.fr/users/lduplain" target="_blank">
    <img alt="42 login: lduplain" src="https://img.shields.io/badge/42%20login-lduplain-2DD57B?style=flat-square"/>
  </a>
</p>

<p align="left">
  gradient-generator is a small java library to create custom gradients using java.awt.Color.<br>
  <br>
  Created by Loïs Duplain. (42login: lduplain, 42mail: lduplain@student.42lyon.fr)
</p>

<h2 align="left">🏗️ Compile</h2>
<p align="left">To basically compile program:</p>

```bash
./gradlew build
```

<p align="left">To clean all *.o in project:</p>

```bash
./gradlew clean
```

<h2 align="left">📚 Usage</h2>
<p align="left">Example:</p>

```java
public static void main(String[] args) {
    Gradient gradient = new Gradient();
    gradient.getColors().add(Color.YELLOW);
    gradient.getColors().add(Color.ORANGE);
    gradient.getColors().add(Color.RED);
    gradient.getColors().add(Color.MAGENTA);
    gradient.getColors().add(Color.BLUE);

    for (int i = 0; i < 1920; i++) {
        Color color = gradient.getColor(i, 1920);
        // 'color' variable now contains the color at the position 'i'
        // in a gradient of size '1920'
    }
}
```

<p align="left">Result (run library to see it):</p>
<img alt="example result" src="https://github.com/LoisDuplain/gradient-generator/blob/main/gallery/result.png?raw=true"/>

<h2 align="left">⚖️ Copyright</h2>
<p align="left">
  Loïs Duplain (lduplain) © 2021
</p>