/* 
The following solution is pretty lengthy, but very simple to understand. The approach is very simple. Check the validity of the sudoku row-wise, column-wise and finally, check all the 3 x 3 sub-boxes
*/

class Solution {
    public boolean isValidSudoku(char[][] board) {
        //checking row wise
        for(int i=0; i<9; i++) {
            HashMap<String, Integer> map = new HashMap<String, Integer>();
            for(int j=0; j<9; j++) {
                String var = String.valueOf(board[i][j]);
                if(var.equals(".")) {
                    continue;
                }
                if(map.containsKey(var)) {
                    return false;
                }
                else {
                    map.put(var, 1);
                }
            }
        }

        //checking column wise
        for(int i=0; i<9; i++) {
            HashMap<String, Integer> map2 = new HashMap<String, Integer>();
            for(int j=0; j<9; j++) {
                String var2 = String.valueOf(board[j][i]);
                if(var2.equals(".")) {
                    continue;
                }
                if(map2.containsKey(var2)) {
                    return false;
                }
                else {
                    map2.put(var2, 1);
                }
            }
        }

        //checking all the 3 x 3 sub-box
        HashMap<String, Integer> map01 = new HashMap<String, Integer>();
        for(int i=0; i<3; i++) {
            for(int j=0; j<3; j++) {
                String var01 = String.valueOf(board[j][i]);
                if(var01.equals(".")) {
                    continue;
                }
                if(map01.containsKey(var01)) {
                    return false;
                }
                else {
                    map01.put(var01, 1);
                }
            }
        }

        HashMap<String, Integer> map02 = new HashMap<String, Integer>();
        for(int i=0; i<3; i++) {
            for(int j=3; j<6; j++) {
                String var02 = String.valueOf(board[j][i]);
                if(var02.equals(".")) {
                    continue;
                }
                if(map02.containsKey(var02)) {
                    return false;
                }
                else {
                    map02.put(var02, 1);
                }
            }
        }

        HashMap<String, Integer> map03 = new HashMap<String, Integer>();
        for(int i=0; i<3; i++) {
            for(int j=6; j<9; j++) {
                String var03 = String.valueOf(board[j][i]);
                if(var03.equals(".")) {
                    continue;
                }
                if(map03.containsKey(var03)) {
                    return false;
                }
                else {
                    map03.put(var03, 1);
                }
            }
        }

        HashMap<String, Integer> map04 = new HashMap<String, Integer>();
        for(int i=3; i<6; i++) {
            for(int j=0; j<3; j++) {
                String var04 = String.valueOf(board[j][i]);
                if(var04.equals(".")) {
                    continue;
                }
                if(map04.containsKey(var04)) {
                    return false;
                }
                else {
                    map04.put(var04, 1);
                }
            }
        }

        HashMap<String, Integer> map05 = new HashMap<String, Integer>();
        for(int i=3; i<6; i++) {
            for(int j=3; j<6; j++) {
                String var05 = String.valueOf(board[j][i]);
                if(var05.equals(".")) {
                    continue;
                }
                if(map05.containsKey(var05)) {
                    return false;
                }
                else {
                    map05.put(var05, 1);
                }
            }
        }
        
        HashMap<String, Integer> map06 = new HashMap<String, Integer>();
        for(int i=3; i<6; i++) {
            for(int j=6; j<9; j++) {
                String var06 = String.valueOf(board[j][i]);
                if(var06.equals(".")) {
                    continue;
                }
                if(map06.containsKey(var06)) {
                    return false;
                }
                else {
                    map06.put(var06, 1);
                }
            }
        }

        HashMap<String, Integer> map07 = new HashMap<String, Integer>();
        for(int i=6; i<9; i++) {
            for(int j=0; j<3; j++) {
                String var07 = String.valueOf(board[j][i]);
                if(var07.equals(".")) {
                    continue;
                }
                if(map07.containsKey(var07)) {
                    return false;
                }
                else {
                    map07.put(var07, 1);
                }
            }
        }

        HashMap<String, Integer> map08 = new HashMap<String, Integer>();
        for(int i=6; i<9; i++) {
            for(int j=3; j<6; j++) {
                String var08 = String.valueOf(board[j][i]);
                if(var08.equals(".")) {
                    continue;
                }
                if(map08.containsKey(var08)) {
                    return false;
                }
                else {
                    map08.put(var08, 1);
                }
            }
        }

        HashMap<String, Integer> map09 = new HashMap<String, Integer>();
        for(int i=6; i<9; i++) {
            for(int j=6; j<9; j++) {
                String var09 = String.valueOf(board[j][i]);
                if(var09.equals(".")) {
                    continue;
                }
                if(map09.containsKey(var09)) {
                    return false;
                }
                else {
                    map09.put(var09, 1);
                }
            }
        }

        return true;
    }
}