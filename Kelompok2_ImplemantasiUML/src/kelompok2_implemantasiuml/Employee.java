/*
 * 
 * Kelompok 2 KMMI PBO
 * - Yogi Andaru (2017051062)
 * - Safiira Rahmah Linisa (2017051015)
 *
 */
package kelompok2_implemantasiuml;


abstract class Employee {

    
    /**
     * Constructor
     *
     * @param name the nama pelamar
     * @param afm  the taxid pelamar
     */
    private String name, afm;
    
    public Employee(String n, String a) {
        this.name = n;
        this.afm = a;
    }

    public final String getName() {
        return name;
    }

    public final String getAfm() {
        return " TAXid : " + afm;
    }

    public abstract int payment();

    public void setName(String name) {
        this.name = name;
    }

    public void setAfm(String a) {
        this.afm = a;
    }
}