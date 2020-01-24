package HomeWork;

public class MidTerm {

    private int points = 12;

    public  boolean hasLicense(){
        if(this.points >0){
            return true;
        } else
            return false;
    }

    public int checkPoints(int speed){
        if(speed <=70){
            return 0;
        }
        int tempPoints = (speed -70)/5;
        points = points - tempPoints;
        return points;

    }
    public int[] removeNumber(int number, int[] array){
        int newSize =0;
        for(int i = 0; i<array.length; i++){
            if(array[i]!=number){
                newSize++;
            }
        }
             int[]tempArray = new int[newSize];
             int index = 0;
             for(int i =0; i<array.length; i++){
                 if(array[index]!=number){
                     tempArray[index]=array[i];
                     index++;
                 }
             }
             return tempArray;
    }
    public int getSmallestNumber(int[] arrSort) {
        //length = arrSort.length;
        int min;
        int temp=0;
        for (int i = 0; i<arrSort.length; i++) {
            min = i;
            for (int j = i + 1; j < arrSort.length; j++) {
                if (arrSort[j] < arrSort[min]) {
                    min = j;
                }
            }
            temp = arrSort[i];
            arrSort[i] = arrSort[min];
            arrSort[min] = temp;
        }

        int number = 0;
        for(int i = 1;i<arrSort.length;i++){
            if(arrSort[i-1]!=arrSort[i]+1){
                number = arrSort[i-1]+1;
            }
        }
        return number;

    }

}
