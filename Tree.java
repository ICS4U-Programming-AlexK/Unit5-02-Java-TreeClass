public class Tree {
    /**
     * The number of leaves on the tree.
     */
    private int numberOfLeaves;
    /**
     * The height of the tree in feet.
     */
    private int feetTall;
    /**
     * The default number of leaves on the tree.
     */
    private static final int GROWTH_RATE = 1000;
    /**
     * The default height increase of the tree.
     */
    private static final int HEIGHT_INCREASE = 3;
    /**
     * Constructor for the Tree class.
     *
     * @param theNumberOfLeaves
     * The number of leaves on the tree.
     * @param theFeetTall
     * The height of the tree in feet.
     */
    public Tree(final int theNumberOfLeaves, final int theFeetTall) {
        this.numberOfLeaves = theNumberOfLeaves;
        this.feetTall = theFeetTall;
    }
    /**
     * This method simulates the growth of a tree
     * by increasing the number of leaves
     * and height.
     */
    public void grow() {
        numberOfLeaves += GROWTH_RATE;
        feetTall += HEIGHT_INCREASE;
    }
    /**
     * Gets the number of leaves on the tree.
     * @return The number of leaves on the tree.
     */
    public int getNumberOfLeaves() {
        return this.numberOfLeaves;
    }
    /**
     * Gets the height of the tree.
     * @return The height of the tree.
     */
    public int getFeetTall() {
        return this.feetTall;
    }
}
