# Compiling the examples

The first step is to compile the examples into an executable JAR:

    ./gradlew jar

# Running the examples

Now we can run individual examples like so

    java -cp build/libs/misc-jar.jar <FQN of a main class>

for example

    java -cp build/libs/misc-jar.jar expressions.SimpleExpressions

# List of executable main classes

```
expressions.SimpleExpressions
exprfactory.SimpleExpressionsWithFactory
imperative.SimpleImperative
misc.Animals
misc.Comparing
misc.EnumTest
misc.IdentityAndEquality
misc.InterfaceCast
misc.IteratorRemove
misc.MethodBinding
misc.OrgChart
misc.Outer
misc.SimpleReflection
misc.Super
misc.UnmodifiableCollections
mixin.Mixin
mixin.SimpleImperativeMixin
objects.Objects
records.Records
treesearch.TreeSearch
vexpressions.VisitorExpressions
```

# How to generate this list in UNIX

We first look for suitable main methods.
Then we translate the resulting list of files into a list of classes.

```
grep -l -r 'void main' src/main/java |\
cut -d/ -f4- | cut -d. -f1 | tr '/' '.' | sort
```