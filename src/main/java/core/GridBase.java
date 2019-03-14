package core;

public abstract class GridBase {



    // number of grid cells
    private int nx;
    private int ny;
    private int nz;

    // size of grid cells
    private double dx;
    private double dy;
    private double dz;

    public GridBase(int nx, int ny, int nz){
        this.nx = nx;
        this.ny = ny;
        this.nz = nz;
    }

    public GridBase(int nx, int ny){
        this.nx = nx;
        this.ny = ny;
        this.nz = 0;
    }

    public GridBase(int nx){
        this.nx = nx;
        this.ny = 0;
        this.nz = 0;
    }

    private void run(){


    }





}
