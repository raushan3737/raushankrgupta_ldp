
Java Exceptions: When executing Java code, different errors can occur: coding errors made by the programmer,
errors due to wrong input, or other unforeseeable things.

When an error occurs, Java will normally stop and generate an error message.
The technical term for this is: Java will throw an exception (throw an error).

try & catch block to handle exception:
The try statement allows you to define a block of code to be tested for errors while it is being executed.
The catch statement allows you to define a block of code to be executed, if an error occurs in the try block.
The try and catch keywords come in pairs:
Syntax:
try {
//  Block of code to try
}
catch(Exception e) {
//  Block of code to handle errors
}


Keyword which is used in exception handling :
Finally : The finally statement lets you execute code, after try...catch, regardless of the result.

    throw statement allows you to create a custom error.
    The throw statement is used together with an exception type

Types of Exception:
1.Checked Exceptions: These are exceptions that the compiler requires the program to handle. Any method that can throw a checked exception
must declare the exception in its method signature using the throws keyword. Examples of checked exceptions include IOException, SQLException, and ClassNotFoundException.

        Ex: 
            public void readFile(String filename) throws FileNotFoundException, IOException {
            BufferedReader reader = null;
            try {
                reader = new BufferedReader(new FileReader(filename));
                String line;
                while ((line = reader.readLine()) != null) {
                    System.out.println(line);
                }
            } finally {
                if (reader != null) {
                    reader.close();
                }
            }
        }

        In the above example, the readFile method reads the contents of a file and prints each line to the console.
        The method declares that it can throw two checked exceptions - FileNotFoundException and IOException. 
        These exceptions may occur if the file cannot be found or if an I/O error occurs while reading the file. The calling method can catch these exceptions and take appropriate action to recover from the error.

        2.Unchecked Exceptions: These are exceptions that do not have to be declared in the method signature and can be thrown at runtime.
         Unchecked exceptions are subclasses of RuntimeException or Error. Examples of unchecked exceptions include NullPointerException, ArrayIndexOutOfBoundsException, and ArithmeticException.

        Ex: 
            public int divide(int a, int b) {
            return a / b;
             }

        In the above example, the divide method divides a by b and returns the result. If b is zero, an ArithmeticException will be thrown at runtime.
        This exception is an unchecked exception, and the calling method may not be able to recover from the error.


It is generally recommended to use checked exceptions for conditions that can reasonably be expected to occur and that the
calling method should be prepared to handle. Unchecked exceptions are typically used for conditions that are unexpected or
indicate a programming error, and that the calling method may not be able to handle.

When to use checked or unchecked Exceptions:
Checked exceptions should be used for error conditions that are expected to occur in normal program execution and that the calling method should be able to handle.
Examples include file I/O errors, database errors, and network errors. In these cases, the calling method can catch the exception and take appropriate action to recover from the error.

    Unchecked exceptions, on the other hand, should be used for conditions that are unexpected or indicate a programming error, and that the calling method may not be able to handle.
    Examples include null pointer exceptions, index out of bounds exceptions, and arithmetic exceptions. In these cases, the exception is typically caused by a bug in the program,
    and the calling method may not be able to recover from the error





    Exception: An unwanted/unexpected event that disturbs the normal flow of the program.
    Real life Example: Facing network error, System failure etc.
    Java Exception Example: Read data from the remote file(FileNotFoundException)
    
    Purpose: To have graceful termination of the program.
    If something went wrong we should not miss anything like(Resources,Work).
    
    Let say we have a scenario:(While reading the data we got SQLException if we don't handle the occurred exception
    then the program will be terminated at 2nd step & DB connection will be open always due to we can't able to close the
    DB connection. If this happens for many programs then our server will be crashed or overload)
    
    Flow: Open DB connection => Read data => Close DB connection.
    
    Exception Handling: While facing exception, Defining alternative way to continue the rest of the program normally.
    Ex: Read data from remote file locating at london & use the data <==> Read data from remote file locating at london if london file is not available then read the local file & then use the data.  
    Dummy Program:
    try{
    // Read data from london location
    } catch(FileNotFoundException){
    // Use local file & continue rest of the program normally
    }
  