# bitbox

If you're tired of using different tools to make base conversions or 
shift operations, then you can use **bitbox**!

There are 3 tools available. 
They're very simple tools without any comples logic, but they can be useful.

The project is written in **Java 8** and the project can be built using **Maven**.

# Download, Build & Run

You must have `git`, `Java 8` and `Maven` installed.

```
git clone https://github.com/fusiled/bitbox
cd bitbox mvn clean install
java -jar target/bitbox-1.0-SNAPSHOT.jar
``` 
# Jar Download Link

If you don't want to compile with Maven you can download the compiler jar at the following link:

[https://drive.google.com/open?id=0B8vc7cpy6aOcYjQtLTl3VHlEMDg](https://drive.google.com/open?id=0B8vc7cpy6aOcYjQtLTl3VHlEMDg)


## BaseConverter

A simple base converter. Change the value in a field and observe the 
other fields changing.

**TODOs**:

* Fix reset of the field. It can be annoying.

## BitCombiner

Just split operation in different fields. It's just a visual helper. The 
result is computed with a parser built with Antlr. Operations are performed using *longs*.
You can use the following bases:

* decimal: `1234`
* hexadecimal: `0xf3`
* binary: `0b1001`

## BitPainter

Draw the image of a bit sequence. It is possible to add labels to the bits.
You specify the layout with a comma-separated list of `[SET]"description"`.
`SET` can be a `comma-separated list of integers` or an **inclusive** range `[min..MAX]` (both the minimum and the
maximum are included).

**TODOs**:

* No need to put empty string after a set.
* Set title in grammar
* add note feature

