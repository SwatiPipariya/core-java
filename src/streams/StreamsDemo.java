package streams;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class StreamsDemo {
     
	
	public static void main(String[] args) {
        List<Integer> numberList = new ArrayList<>();
        numberList.add(100);
        numberList.add(200);
        numberList.add(300);
        numberList.add(400);
        numberList.add(500);
        
        
        List<Integer> squaresList = new ArrayList<>();
        for(Integer i: numberList) {
        	squaresList.add(i*i);
        }
        System.out.println(squaresList);
        
        
        // Now we'll find squares of these numbers with the help of Stream API since its more efficient also called functional programming approach
        
        List<Integer> squareList = numberList.stream().map(x -> x*x).collect(Collectors.toList());
        System.out.println("List of squared numbers: " + squareList);
        
        
        Set<Integer> squaresSet = new HashSet<>();
        for(Integer i: numberList) {
        	squaresSet.add(i*i);
        }
        System.out.println(squaresSet);
        
          Set<Integer> squareSet = numberList.stream().map(x -> x*x).collect(Collectors.toSet());
          System.out.println("Set of squared numbers: " + squareSet);
          
          List<String> languages = new ArrayList<>();
          languages.add("scala");
          languages.add("java");
          languages.add("python");
          languages.add("C++");
          
          List<String> filterResult = new ArrayList<>();
          for(String s: languages) {
        	  if(s.startsWith("p")) {
        		  filterResult.add(s);
        	  }
          }
          System.out.println("Languages starting with p: " + filterResult);
          
          
//          List<String> filtersResult = languages.stream().filter(s->s.startsWith("p")).collect(Collectors.toList());
//          System.out.println("Languages starting with letter p: " + filtersResult);
//          
//          List<String> sortedList = languages.stream().sorted().collect(Collectors.toList());
//          System.out.println("Languages sorted in alphabetical order: " + sortedList);
          
          // For Each in Stream API
//          System.out.println("Printing all elements one by one");
//          languages.stream().forEach(a -> System.out.println("Element is: " + a));
          
          // Demonstration of reduce method
          
//           Identity - An element that is the initial value of the reduction operation 
//             and the default result if the stream is empty
          
//          Accumulator - A function that takes two parameters:
//            a partial result of the reduction operation and the next element of the stream
          
//            Combiner - a function used to combine the partial result of the reduction operation
//          when the reduction is parallelized, or when there's a mismatch between the types of the accumulator
//          arguments and the types of the accumulator implementation
            
             int sum = numberList.stream().reduce(0,(ans,i) -> ans+i);
             
             System.out.println("Sum of all elements in the numberlist : " + sum);
          
          
          
          
          
          
	}
	
	

}
