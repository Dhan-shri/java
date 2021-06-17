public class Text {

    public static void main(String[] args) {
        System.out.println("hello dhanshri");
        String name= "dhanshri";
        String lastName = "Sonwane";
        System.out.println("the length of name:-"+ name.length());
        System.out.println(name.toUpperCase());
        System.out.println(name.toLowerCase());
        System.out.println( name+ " "+ lastName);   //The + operator can be used between strings to combine them. This is called concatenation
        System.out.println(name.concat(lastName)) ; //You can also use the concat() method to concatenate two strings:
        String txt= "hiii my name is \"dhanshri\" and \n\tiam 19 year old";
        System.out.println(txt);
        System.out.println(Math.min(17, 6));
        System.out.println(Math.max(25, 8));
        System.out.println(Math.sqrt(81));     //to find square root
        System.out.println(Math.abs(-2.5));     //The Math.abs(x) method returns the absolute (positive) value of x:
        System.out.println(Math.random());    // Math.random() returns a random number between 0.0 (inclusive), and 1.0 (exclusive):
        //To get more control over the random number, e.g. you only want a random number between 0 and 100, you can use the following formula:
        int randomNumber = (int)(Math.random()*101);
        System.out.println(randomNumber);


        //Boolean
        int a= 67 , b=89;
        System.out.println(a>b);  //false
        System.out.println(a<b); //true
        System.out.println(a==67); //true

        // java if else condition
        if ( 29>89) {
            System.out.println("29 is bigger than 89");
        }else if (29<89){
            System.out.println("29 is smaller than 89");
        } else{
            System.out.println("29 is equal 89");
        }

        //short hand if else 
        int time = 20;
        String result = (time<18)? "Good Day." : "Good Evening.";
        System.out.println(result);

        //JAVa Switch statement
        //Use the switch statement to select one of many code blocks to be executed.
        //The default keyword specifies some code to run if there is no case match:


        int day = 8 ;
        switch (day){
            case 1: 
            System.out.println("monday");
            break;
            case 2:
            System.out.println("tuesday");
            break;
            case 3:
            System.out.println("wednesday");
            break;
            case 4:
            System.out.println("thursday");
            break;
            default:
            System.out.println("looking forward to the weekend");

        }


        // While loop
        System.out.println("---WHIlE LOOp---");
        int i=0;
        while (i<5){
            System.out.println("i:"+i);
            i++;
        }

        //The do/while loop is a variant of the while loop. This loop will execute the code block once, before checking if the condition is true, then it will repeat the loop as long as the condition is true.
        int k =0;
        do {
            System.out.println(k+1);
            k++;
        }
        while(k<8);

        // For loop
        System.out.println("---FOr Loop---");
        for(int l=0; l<3; l++){
            System.out.println(l);
        }


//There is also a "for-each" loop, which is used exclusively to loop through elements in an array:
        System.out.println("---for each loop---");
        String[] cars ={ "volvo","BMW","Ford","Mazda" };
        for (String h : cars){
            System.out.println(h);
        }

        //JAVA BREAK AND CONTINUE
        //The break statement can also be used to jump out of a loop.
        
        for (int x=0; x<4; x++){
            if (x==4){
                // continue;
                break;
            }
            System.out.println(x);
        }

        //JAVA ARRAY
        //To declare an array, define the variable type with square brackets:
        String[] car={"volvo","bmw","ford"};
        System.out.println(car[0]);
        int[] age={10,34,45,34};
        System.out.println(age[3]);
        System.out.println(cars.length); // array length
        //loop throug array
        System.out.println("--loop through arrya--");
        for (int g=0; g<age.length;g++){
            System.out.println(age[g]);
        }
        System.out.println("--multidimensional array--");
//A multidimensional array is an array containing one or more arrays.
        int[][] myNumbers ={ {1, 2, 3, 4}, {5, 6, 7} };
        int z = myNumbers[1][2];
        System.out.println(z);






        

    
    
    } 


}

