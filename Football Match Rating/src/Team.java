public class Team {
    private int[] form; // 1 - win; 0 - draw; -1 loss
    private String name;
    private int tablePosition; // -1 denotes a position that doesn't exist

    public Team(String name){
        this.name = name;
        form = new int[5];
        tablePosition = -1;
    }

    public Team(String name, int[] form, int tablePosition){
        this.name = name;
        this.form = form;
        this.tablePosition = tablePosition;
    }

    public int[] getForm(){
        return form;
    }

    public String getName() {
        return name;
    }

    public int getTablePosition() {
        return tablePosition;
    }

    public void setTablePosition(int newPosition){
        this.tablePosition = newPosition;
    }
}
