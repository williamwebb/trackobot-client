trackobot-client | [![Release](https://jitpack.io/v/io.williamwebb/trackobot-client.svg)](https://jitpack.io/#io.williamwebb/trackobot-client) [![CircleCI](https://circleci.com/gh/williamwebb/trackobot-client.svg?style=svg)](https://circleci.com/gh/williamwebb/trackobot-client)
============

trackobot client

Usage
=====

```
// password or token are required
val client = TrackobotClient(
    okHttpClient, 
    username, 
    password, 
    token
)
```

Installation
=====
```
// Add the JitPack repo
repositories {
    maven { url 'https://jitpack.io' }
}

// Add dependency
dependencies {
    compile 'io.williamwebb:trackobot-client:<version>'
}
```
License
-------

    Copyright 2017 William Webb

    Licensed under the Apache License, Version 2.0 (the "License");
    you may not use this file except in compliance with the License.
    You may obtain a copy of the License at

       http://www.apache.org/licenses/LICENSE-2.0

    Unless required by applicable law or agreed to in writing, software
    distributed under the License is distributed on an "AS IS" BASIS,
    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    See the License for the specific language governing permissions and
    limitations under the License.