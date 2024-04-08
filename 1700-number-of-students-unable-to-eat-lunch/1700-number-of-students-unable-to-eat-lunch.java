class Solution {
    public int countStudents(int[] students, int[] sandwiches) {
        //simulation problem
        //take stack ans queue and simulate as given in the question
        //simulation problem
        //take stack ans queue and simulate as given in the question
        int n = students.length;
        int[] arr = new int[2];
        //arr[0] = count of student who like 0 sandwich
        //arr[1] = count of student who like 1 sandwich
        for (int num : students) {
            arr[num]++;
        }

        //Now sandwiches party
        for (int i = 0; i < n; i++) {
            
            int sand = sandwiches[i];
            
// here I'm checking is sandwhiches tasty
            
            if (arr[sand]== 0) {
                return n - i;
            }
            
            arr[sand]--;
            
        }
        
        return 0;

    }
}