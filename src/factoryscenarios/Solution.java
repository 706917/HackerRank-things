package factoryscenarios;

import java.util.List;

public class Solution {
	
	public void maximumContainers (List<String> scenarios) {
		
	for(String scena : scenarios){
        String [] array = scena.split(" ");

        int budget = Integer.parseInt(array[0]);
        int cost = Integer.parseInt(array[1]);
        int gift = Integer.parseInt(array[2]);

        int total  = budget/cost;
        //System.out.println(total);
        int reminder = budget/cost;
        //System.out.println(reminder);
        

        while(reminder >= gift ){
            total = total + reminder/gift;
            int spare = reminder%gift;
            reminder = reminder/gift + spare;
            
        }

        System.out.println(total);

    }

    }

}


