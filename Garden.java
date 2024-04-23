package garden;

import garden.plants.Plant;

public class Garden{

    private final Ornament[][] items;
    private String[][] grid;

    public Garden(int rows, int columns) {
        this.items = new Ornament[rows][columns];
        this.grid = new String[rows][columns];


        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                this.grid[i][j] = "*";
            }
        }
    }



    public boolean add(int rowPosition, int columnPosition, Ornament ornament){

        if (rowPosition < 0 || rowPosition > this.items.length || columnPosition < 0 || columnPosition > this.items.length){

            return false;

        } else if (this.items[rowPosition][columnPosition] != null){

            return false;

        } else{

            this.items[rowPosition][columnPosition] = ornament;

            this.grid[rowPosition][columnPosition] = ornament.toString();

            return true;

        }

    }

    public boolean remove(int rowPosition, int columnPosition){

        if (rowPosition < 0 || rowPosition > this.items.length || columnPosition < 0 || columnPosition > this.items.length){

            return false;

        } else if (this.items[rowPosition][columnPosition] == null){

            return false;

        } else{

            this.grid[rowPosition][columnPosition] = null;

            return true;

        }



    }

    public int count(){

        int counter = 0;

        for (int i = 0; i < this.items.length; i++){

            for (int j = 0; j < this.items[i].length; j++){

                if (this.items[i][j] != null){

                    counter += 1;

                }

            }

        }

        return counter;

    }

    void displayColours(int season){

        for (int i = 0; i < this.items.length; i++){

            for (int j = 0; j < this.items[i].length; j++){

                if (this.items[i][j] != null || this.items[i][j] instanceof Plant){

                    Plant plant = (Plant) items[i][j];

                } else if (this.items[i][j] != null || this.items[i][j] instanceof tiles){

                    tiles tiles = (tiles) items[i][j];

                }

            }

        }

    }

    void displayNames(){

        for (int i = 0; i < this.items.length; i++){

            for (int j = 0; j < this.items[i].length; j++){

                if (this.items[i][j] != null || this.items[i][j] instanceof Plant){

                    Plant plant = (Plant) items[i][j];
                    plant.getName();

                } else if (this.items[i][j] != null || this.items[i][j] instanceof tiles){

                    tiles tiles = (tiles) items[i][j];
                    tiles.getName();

                }

            }

        }

    }

    double consumedWater(int days){

        double totalConsumption = 0;

        for (int i = 0; i < this.items.length; i++){

            for (int j = 0; j < this.items[i].length; j++){

                if(this.items[i][j] instanceof Plant){

                    Plant plant = (Plant) items[i][j];
                    totalConsumption += plant.waterConsumption(days);

                }

            }

        }

        return totalConsumption;

    }


    int count(Ornament ornament){

        int counter = 0;

        for (int i = 0; i < this.items.length; i++){

            for (int j = 0; j < this.items[i].length; j++){

                if (this.items[i][j] != null || this.items[i][j].equals(ornament)){

                    counter += 1;

                }

            }

        }

        return counter;

    }


}

interface Ornament {

    String colour(int season);
    String getName();

}


