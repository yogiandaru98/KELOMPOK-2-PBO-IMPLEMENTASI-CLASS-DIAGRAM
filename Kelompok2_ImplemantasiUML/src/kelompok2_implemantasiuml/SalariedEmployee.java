/*
 * 
 * Kelompok 2 KMMI PBO
 * - Yogi Andaru (2017051062)
 * - Safiira Rahmah Linisa (2017051015)
 *
 */
package kelompok2_implemantasiuml;


class SalariedEmployee extends Employee {
    /**
     * Constructor
     *
     * @param n         the employee's name
     * @param afm          the employee's Social Security number
     * @param s the employee's annual salary
     */
    public SalariedEmployee(String n, String afm, int s) {
        super(n, afm);
        this.salary = s;
    }

    private int salary;

    public void setSalary(int s) {
        this.salary = s;
    }

    @Override
    public int payment() {
        return salary;
    }
}