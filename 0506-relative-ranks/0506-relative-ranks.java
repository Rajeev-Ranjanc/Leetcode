class Solution {
    public String[] findRelativeRanks(int[] score) {
        
        int max = score[0];

        for (int i = 1; i < score.length; i++) {
            if (max < score[i]) {
                max = score[i];
            }
        }

        int[] hash = new int[max + 1];

        Arrays.fill(hash, -1);

        for (int i = 0; i < score.length; i++) {

            hash[score[i]] = i;

        }
        int rank = 1;
        String[] result = new String[score.length];
        for (int i = hash.length - 1; i >= 0; i--) {
            if (hash[i] != -1) {
                int atheletrank = hash[i];
                if (rank == 1) {
                    result[atheletrank] = "Gold Medal";
                } else if (rank == 2) {
                    result[atheletrank] = "Silver Medal";
                } else if (rank == 3) {
                    result[atheletrank] = "Bronze Medal";
                } else {
                    result[atheletrank] = String.valueOf(rank);
                }
                rank++;
            }

        }
        return result;
        
    }
}