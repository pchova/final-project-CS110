import java.util.ArrayList;

public class tester {
    public static void main(String args[]){
        String lineFromFile = "A A1 A5";
        char type;
        String pos1, pos2;

        String[] splitLine = lineFromFile.split("\\s+");
        type = splitLine[0].charAt(0);

        pos1 = splitLine[1];
        pos2 = splitLine[2];

        System.out.println(type);
        System.out.println(pos1);
        System.out.println(pos2);



        /*
        ArrayList<ArrayList<CellStatus>> layout;
        Fleet fleet;
        final int SIZE = 10;

        //initialize AL of AL to have 10 rows
        layout = new ArrayList<ArrayList<CellStatus>>(SIZE);

        //create n lists one by one and append to the master list
        ArrayList<CellStatus> r1 = new ArrayList<CellStatus>();
        for(int i = 0; i < SIZE; i++) {
            r1.add(CellStatus.NOTHING);
        }
        layout.add(r1);

        ArrayList<CellStatus> r2 = new ArrayList<CellStatus>();
        for(int i = 0; i < SIZE; i++) {
            r2.add(CellStatus.NOTHING);
        }
        layout.add(r2);

        ArrayList<CellStatus> r3 = new ArrayList<CellStatus>();
        for(int i = 0; i < SIZE; i++) {
            r3.add(CellStatus.NOTHING);
        }
        layout.add(r3);

        ArrayList<CellStatus> r4 = new ArrayList<CellStatus>();
        for(int i = 0; i < SIZE; i++) {
            r4.add(CellStatus.NOTHING);
        }
        layout.add(r4);

        ArrayList<CellStatus> r5 = new ArrayList<CellStatus>();
        for(int i = 0; i < SIZE; i++) {
            r5.add(CellStatus.NOTHING);
        }
        layout.add(r5);

        ArrayList<CellStatus> r6 = new ArrayList<CellStatus>();
        for(int i = 0; i < SIZE; i++) {
            r6.add(CellStatus.NOTHING);
        }
        layout.add(r6);

        ArrayList<CellStatus> r7 = new ArrayList<CellStatus>();
        for(int i = 0; i < SIZE; i++) {
            r7.add(CellStatus.NOTHING);
        }
        layout.add(r7);

        ArrayList<CellStatus> r8 = new ArrayList<CellStatus>();
        for(int i = 0; i < SIZE; i++) {
            r8.add(CellStatus.NOTHING);
        }
        layout.add(r8);

        ArrayList<CellStatus> r9 = new ArrayList<CellStatus>();
        for(int i = 0; i < SIZE; i++) {
            r9.add(CellStatus.NOTHING);
        }
        layout.add(r9);

        ArrayList<CellStatus> r10 = new ArrayList<CellStatus>();
        for(int i = 0; i < SIZE; i++) {
            r10.add(CellStatus.NOTHING);
        }
        layout.add(r10);

        for (int i = 0; i < layout.size(); i++) {
            for (int j = 0; j < layout.get(i).size(); j++) {
                System.out.print(layout.get(i).get(j) + " ");
            }
            System.out.println();
        }
        */
    }
}

