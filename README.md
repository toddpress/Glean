# Glean 🔥 -- many hot very sizzle much stream wow 

# Prerequisite

 1. Ensure appropriate `java` installation
```bash
$ java -version
java version "1.8.0_60"
```
 2. `brew` install `gradle`, `node`, and `mongodb`
```bash
  $ brew install gradle
  $ brew install mongo
  $ brew install node
```
> __Note__: if using win, use [scoop](http://scoop.sh/) as an alternative to brew:

```bash
  $ scoop install gradle
  $ scoop install mongo 
  $ scoop install node
```
------

# Setup

 1. Clone the repo
```bash
  $ git clone git@github.com:justinmvail/Glean.git
```

 2. Build Glean
```bash
  $ cd Glean/ && gradle
```

## Better way to do following @justinmvail?

 3. Seed data Glean & run tests
```bash
  $ gradle test -PincludeSeed=true
```

# Start mongodb server
 1. Start server in __new__ terminal window (Press `⌘ + N`)
```bash
  $ mongod 
```
# Run Glean
 1. Launch that bitch
```bash
  $ gradle runBoot
```
# 🎉 Congrats, Gleaner! Let's verify:
 ```
  $ curl http://localhost:8080/session?userName=Penny | node <<< "var o = $(cat); console.log(JSON.stringify(o, null, 4));"
```
