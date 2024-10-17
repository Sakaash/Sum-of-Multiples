public class GameLogic {
    int level;
    int[] arr;
    int total;
    GameLogic(int level, int[] arr) {
        this.level = level;
        this.arr = arr;
    }

    void printBaseTotal() {
        for(int i = 1; i<level; i++) {
            for(int j = 0; j<arr.length; j++) {
                if(i%arr[j] == 0) {
                    total+=i;
                    break ;
                }
            }
        }
        System.out.println(total);
    }
}

