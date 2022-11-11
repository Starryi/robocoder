A development environment of [robocode](https://robocode.sourceforge.io/) robots based on [gradle](https://gradle.org/)

# configure

Specify the version and installation directory of [robocode](https://robocode.sourceforge.io/) to be installed
in `build.gradle`

```groovy
ext {
    ROBOCODE_SETUP_DIR = '.setup'
    ROBOCODE_INSTALL_DIR = '.robocode'
    ROBOCODE_VERSION = '1.9.4.7'
    ROBOCODE_BATTLE = ''
}
```

# run robocode

Just one line of command

 ```shell
./gradlew robocode
 ```

If you want to run
some [battle](https://robowiki.net/w/index.php?title=Robocode/Console_Usage#Example:_Running_a_battle),
you can specify the battle file name in `build.gradle`.

```groovy
ext {
    ROBOCODE_SETUP_DIR = '.setup'
    ROBOCODE_INSTALL_DIR = '.robocode'
    ROBOCODE_VERSION = '1.9.4.7'
    ROBOCODE_BATTLE = 'sample'
}
```

If you want to pass other args when running robocode, you can modify `robocode` task block in `build.gradle`

```groovy
task robocode(type: JavaExec, dependsOn: 'build') {
    // ...

    args 'arg_name0', 'arg_value0'
    args 'arg_name1', 'arg_value1'
}
```
