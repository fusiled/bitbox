# bitbox

If you're tired of using different tools to make base conversions or 
shift operations, then you can use **bitbox**!

There are 2+1 tools available (BitPainter is under construction). 
They're very simple tools without any comples logic, but they can be useful.

The project is written in **Java** and the project can be built using **Maven**.

# Download, Build & Run

You must have `git`, `Java` and `Maven` installed.

```
git clone https://github.com/fusiled/bitbox
cd bitbox mvn clean install
java -jar target/bitbox-1.0-SNAPSHOT.jar
``` 


## BaseConverter

A simple base converter. Change the value in a field and observe the 
other fields changing.

**TODOs**:

* Add the feature of adding custom bases.

## BitCombiner

Just split operation in different fields. It's just a visual helper. The 
result is computed with a parser built with Antlr. Now it is only  
possible to manipulate integer. 

**TODOs**:

* non-integer support
* express numbers with bases (0x for hex, 0b for binary etc..)

## BitPainter (UNDER DEVELOPMENT)

Draw the image of a bit sequence. It is possible to add labels to the bits. You specify the layout with a comma-separated list of `[SET]"description"`. `SET` can be a `comma-separated list of integers` or an **inclusive** range `[min..MAX]` (both the minimum and the maximum are included).
**TODOs**:

* Interconnect labels and bits

