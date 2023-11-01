package com.zipcodewilmington;

/**
 * Created by leon on 1/24/18.
 */
public class PersonHandler {
    private final Person[] personArray;

    public PersonHandler(Person[] personArray) {
        this.personArray = personArray;
    }

    // NOTICE how the comments can be used to step-by-step break down the problem into 
    // simple lines of code...
    
    public String whileLoop() {
        String result = "";
        int counter = 0;

        while (counter < personArray.length) {
            Person currentPerson = personArray[counter];
            String stringCurrentPerson = currentPerson.toString();
            result = result + stringCurrentPerson;
            counter = counter + 1; // counter++;
        }

        return result;
        // create a `counter`
        // while `counter` is less than length of array
        // begin loop

        // use `counter` to identify the `current Person` in the array
        // get `string Representation` of `currentPerson`
        // append `stringRepresentation` to `result` variable

        // end loop
    }



    public String forLoop() {
        String result = "";
       int start = 0;
       int stop = personArray.length;
       int step = 1;

       for (int i = start; i < stop; i = i + step) {
           Person currentPerson = personArray[i];
           String stringCurrentPerson = currentPerson.toString();
           result = result + stringCurrentPerson;

       }

        return result;

        // identify initial value
        // identify terminal condition
        // identify increment

        // use the above clauses to declare for-loop signature
        // begin loop
        // use `counter` to identify the `current Person` in the array
        // get `string Representation` of `currentPerson`
        // append `stringRepresentation` to `result` variable
        // end loop
    }



    public String forEachLoop() {
        String result = "";
       Person[] arr = getPersonArray();
       for (Person currentPerson : arr)
       {
           String stringCurrentPerson = currentPerson.toString();
           result = result + stringCurrentPerson;
       }

        return result;

        // identify array's type
        // identify array's variable-name

        // use the above discoveries to declare for-each-loop signature
        // begin loop
        // get `string Representation` of `currentPerson`
        // append `stringRepresentation` to `result` variable
        // end loop
    }


    public Person[] getPersonArray() {
        return personArray;
    }
}
