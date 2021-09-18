/*
 * 
 * Kelompok 2 KMMI PBO
 * - Yogi Andaru (2017051062)
 * - Safiira Rahmah Linisa (2017051015)
 *
 */
package kelompok2_implemantasiuml;


import java.text.DecimalFormat;
import javax.swing.JOptionPane;

class Main2 {
	public static void main(String[] args) {
		int numberOfEmployees = 2;
		Employee[] employees = new Employee[numberOfEmployees];

		String[] employeeKinds = { "Hourly", "Salaried" };
		String[] hourlyLabels = { "Name", "TAXid", "Hourly Payment" };
		String[] salariedLabels = { "Name", "TAXid", "Annual Salary" };

		for (int i = 0; i < numberOfEmployees; i++) {
			String kind = (String) JOptionPane.showInputDialog(null,
					"What kind of employee is employee " + (i + 1) + "? ", "", JOptionPane.QUESTION_MESSAGE, null,
					employeeKinds, "Hourly");
			if (kind.equals("Hourly")) {
				boolean ERROR = false;
				do{
				try{
					ERROR = false;
				String[] employeeInfo = MultiInputPane.showMultiInputDialog(null, hourlyLabels, "Employee Information");
				employees[i] = new HourlyEmployee(employeeInfo[0], employeeInfo[1], Integer.parseInt(employeeInfo[2]));
				}catch(NumberFormatException e){
					ERROR = true;
					JOptionPane.showMessageDialog(null,"Please reinput the Hourly Payment with number","Alert",JOptionPane.WARNING_MESSAGE);   
				}
			}while(ERROR==true);
			} else {
				boolean ERROR = false;
				do{
				try {
					ERROR = false;
				String[] employeeInfo = MultiInputPane.showMultiInputDialog(null, salariedLabels,
						"Employee Information");
				employees[i] = new SalariedEmployee(employeeInfo[0], employeeInfo[1],
						Integer.parseInt(employeeInfo[2]));
				}catch(NumberFormatException e){
					ERROR = true;
					JOptionPane.showMessageDialog(null,"Please reinput the Hourly Payment with number","Alert",JOptionPane.WARNING_MESSAGE);   
				}
			}while(ERROR==true);
			}
		}
		System.out.println();
		for (int i = 0; i < employees.length; i++)
			System.out.println("NAMA : " + employees[i].getName() + "\n" + employees[i].getAfm() + "\n" + " Salary : $"
					 + (new DecimalFormat("0.00")).format(employees[i].payment()) + "\n");

		System.exit(0);
	}
}