Stream- A stream is a sequence of objects that supports various methods which can be pipelined to produce the desired result.
The features of Java stream are –

A stream is not a data structure instead it takes input from the Collections, Arrays or I/O channels.
Streams don’t change the original data structure, they only provide the result as per the pipelined methods.
Each intermediate operation is lazily executed and returns a stream as a result, hence various intermediate operations can be pipelined. Terminal operations mark the end of the stream and return the result.

Method support by Stream:
filter => Filter the data based on the condition
map => employee object to convert name(String)
collect=> Get list of mapped name
peek => print
sort
anyMatch
noneMatch
allMatch


Different Operations On Streams-
Intermediate Operations:

map: The map method is used to returns a stream consisting of the results of applying the given function to the elements of this stream.
List number = Arrays.asList(2,3,4,5);
List square = number.stream().map(x->x*x).collect(Collectors.toList());
filter: The filter method is used to select elements as per the Predicate passed as argument.
List names = Arrays.asList("Reflection","Collection","Stream");
List result = names.stream().filter(s->s.startsWith("S")).collect(Collectors.toList());
sorted: The sorted method is used to sort the stream.
List names = Arrays.asList("Reflection","Collection","Stream");
List result = names.stream().sorted().collect(Collectors.toList());


Terminal Operations:

collect: The collect method is used to return the result of the intermediate operations performed on the stream.
List number = Arrays.asList(2,3,4,5,3);
Set square = number.stream().map(x->x*x).collect(Collectors.toSet());
forEach: The forEach method is used to iterate through every element of the stream.
List number = Arrays.asList(2,3,4,5);
number.stream().map(x->x*x).forEach(y->System.out.println(y));
reduce: The reduce method is used to reduce the elements of a stream to a single value.
The reduce method takes a BinaryOperator as a parameter.
List number = Arrays.asList(2,3,4,5);
int even = number.stream().filter(x->x%2==0).reduce(0,(ans,i)-> ans+i);

Here ans variable is assigned 0 as the initial value and i is added to it .


Optional: is a Final and immutable container object which may or may not contain a non-null value present in java.util package.
If a value is present, isPresent() will return true and get() will return the value.

Why Optional introduces:
Every Java Programmer is familiar with NullPointerException. It can crash your code. And it is very hard to avoid it without using too many null checks.
So, to overcome this, Java 8 has introduced a new class Optional in java.util package. It can help in writing a neat code without using too many null checks.
By using Optional, we can specify alternate values to return or alternate code to run. This makes the code more readable because the facts which were hidden are now visible to the developer.

Ex:
// Java program with Optional Class

    import java.util.Optional;
    
    public class OptionalDemo {
    public static void main(String[] args)
    {
    String[] words = new String[10];
    Optional<String> checkNull
    = Optional.ofNullable(words[5]);
    if (checkNull.isPresent()) {
    String word = words[5].toLowerCase();
    System.out.print(word);
    }
    else
    System.out.println("word is null");
    }
    }



