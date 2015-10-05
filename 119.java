public class Solution {
//     public List<Integer> getRow(int rowIndex) {
		
// 		List<Integer> pascalList = new ArrayList<Integer>();
// 		BigDecimal tempI,tempRI,temp;
// 		BigDecimal tempRowIndex = new BigDecimal(rowIndex);
// 		int num;
		
//         for(int i=0;i<=rowIndex;i++){
//         	tempI = new BigDecimal(i);
//         	tempRI = new BigDecimal(rowIndex-i);
//         	temp = factorial(tempRowIndex).divide(factorial(tempI).multiply(factorial(tempRI)));
//         	num = temp.intValue();
//         	pascalList.add(num);
//         }
//         return pascalList;
//     }
	
// 	public BigDecimal factorial(BigDecimal n){
// 		BigDecimal bd1 = new BigDecimal(1);  
//         if(n.equals(new BigDecimal(1))){  
//             return bd1;  
//         }  
//         else  
//             return n.multiply(factorial(n.subtract(bd1))); 
// 	}

    public List<Integer> getRow(int rowIndex) {
        List<Integer> row = new ArrayList<Integer>(rowIndex+1);  
          
        if(rowIndex<0) return row;  
          
        for(int i=0; i<=rowIndex; i++) {  
            row.add(1);  
            for(int j=i-1;j>0; j--) {  
                row.set(j, row.get(j-1)+row.get(j));  
            }  
        }  
        return row; 
    }
}
