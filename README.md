# strata-issues
Project demonstrating issues in Opengamma Strata library

## `BigMoney` issues

### `BigMoney.of`

This factory method creates an instance of `BigMoney` that does not use currency's rounding configuration.

Example:

```java
var bigMoney = BigMoney.of(Currency.USD, 123.456789);
System.out.println("BigMoney.value=" + bigMoney.getValue());
```

Output:

```
BigMoney.value=123.456789
```

Expected:

```
BigMoney.value=123.46
```

## How to build and run project

Build:

```shell
./mvnw package
```

Run (installed Java 17 expected):

```shell
java -jar target/issues-0.0.1-SNAPSHOT.jar
```
