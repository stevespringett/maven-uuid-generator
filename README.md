[![Build Status](https://travis-ci.org/stevespringett/maven-uuid-generator.svg?branch=master)](https://travis-ci.org/stevespringett/maven-uuid-generator)
[![License](https://img.shields.io/badge/license-Apache%202.0-brightgreen.svg)][License]


Maven UUID Generator Plugin
=========

The Maven UUID Generator Plugin generates a unique UUID for each build and assigns value to `project.build.uuid`.

Maven Usage
-------------------

```xml
<plugins>
    <plugin>
        <groupId>us.springett</groupId>
        <artifactId>maven-uuid-generator</artifactId>
        <version>1.0.0</version>
        <executions>
            <execution>
                <phase>clean</phase>
                <goals>
                    <goal>generate</goal>
                </goals>
            </execution>
        </executions>
    </plugin>
</plugins>
```

Copyright & License
-------------------

CycloneDX Maven Plugin is Copyright (c) Steve Springett. All Rights Reserved.

Permission to modify and redistribute is granted under the terms of the Apache 2.0 license. See the [LICENSE] file for the full license.

[License]: https://github.com/stevespringett/maven-uuid-generator/blob/master/LICENSE
