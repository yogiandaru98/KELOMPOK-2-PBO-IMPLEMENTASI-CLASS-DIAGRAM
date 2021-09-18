/*
 * 
 * Kelompok 2 KMMI PBO
 * - Yogi Andaru (2017051062)
 * - Safiira Rahmah Linisa (2017051015)
 *
 */
package kelompok2_implemantasiuml;


import javax.swing.JOptionPane;

class HourlyEmployee extends Employee {
    private int hoursWorked;
    private int hourlyPayment;
    /**
     * Constructor
     *
     * @param name          the nama pelamar
     * @param afm           the taxid pelamar
     * @param hourlyPayment the gaji perlamar per jam
     */
    public HourlyEmployee(String name, String afm, int hourlyPayment) {
        super(name, afm);
        this.hourlyPayment = hourlyPayment;
    }

    @Override
    public int payment() {
        boolean ERROR = false;
        do{
            ERROR = false;
            try{
            String hoursWorkedString = JOptionPane.showInputDialog(null, "Hours worked for " + getName() + "?");
            int hw = Integer.parseInt(hoursWorkedString);
            setHoursWorked(hw);
        }catch(NumberFormatException e){
            ERROR = true;
            JOptionPane.showMessageDialog(null,"Please reinput the Hourly Payment with number","Alert",JOptionPane.WARNING_MESSAGE);   
        }
    }while(ERROR==true);
        return hourlyPayment * getHoursWorked();
    }

    public int getHourlyPayment() {
        return this.hourlyPayment;
    }

    public void setHourlyPayment(int hp) {
        this.hourlyPayment = hp;
    }

    public int getHoursWorked() {
        return this.hoursWorked;
    }

    public void setHoursWorked(int hw) {
        this.hoursWorked = hw;
    }
}