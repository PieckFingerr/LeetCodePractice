package HashTable;

import java.util.HashSet;
import java.util.Set;


/**
 * _217_Contains_Duplicate
 */
public class _217_Contains_Duplicate {

    public boolean containsDuplicate(int[] nums) {
       Set<Integer> mySet = new HashSet<>();
        for (int n : nums){
            if (mySet.contains(n) == true ){
                return true;
            } else {
                mySet.add(n);
            }
        }
       return false;
    }
    


}