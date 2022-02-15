String babyNames[] = {"Zoe", "Luna", "Erika", "Alice"};
String babyNames[];
String babyNames[] = new String[4];

int voltages[];
int voltages[] = new int[6];
int voltages[] = {20, 19, 18, 16, 17, 22};


babyNames[2] = "Maria";

String myBabysName = babyNames[0];

int myMatrix[][];

int myMatrix[][] = {{1,2,3},
                    {4,5,6},
                    {7,8,9}};
int row1[] = {1,2,3};
int row2[] = {4,5,6};
int row3[] = {7,8,9};
int myMatrix[] = {row1,row2,row3};

myMatrix[2][0] = 14;
int temp = myMatrix[1][2];

public int[][] addOne(int[][] array) {
    for (int i = 0; i < array.length; i++) {
        for (int j = 0; j < array[i].length; j++) {
            array[i][j] ++;
        }
    }
    return array;
}

public int numArguments(String... args) {
    return args.length;
}

numArguments("hello","world");
numArguments("a","b","c","d");