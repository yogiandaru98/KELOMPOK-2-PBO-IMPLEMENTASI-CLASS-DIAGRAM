# IMPLEMENTASI UML CLASS DIAGRAM
## KELOMPOK 2 TUGAS PBO
## link [`github`](https://github.com/yogiandaru98/kelompok2_implemantasiuml)

* YOGI ANDARU
* 2017051062
* SAFIIRA RAHMAH LINISA
* 2017051015
#
## LAMPIRAN
![pict1](PICT/1.jpeg)
![pict2](PICT/2.jpeg)
![pict3](PICT/3.jpeg)
![pict4](PICT/4.jpeg)
![pict5](PICT/5.jpeg)
![pict6](PICT/6.jpeg)
![pict7](PICT/7.jpeg)
## CLASS STRUCTURE
> Agar dapat melihat class diagram di bawah terlebih dahulu download [`MERMAID`](https://www.google.com/url?sa=t&rct=j&q=&esrc=s&source=web&cd=&cad=rja&uact=8&ved=2ahUKEwiI0pbxo__yAhUDSX0KHRo9CSgQFnoECAMQAQ&url=https%3A%2F%2Fchrome.google.com%2Fwebstore%2Fdetail%2Fmermaid-diagrams%2Fphfcghedmopjadpojhmmaffjmfiakfil&usg=AOvVaw3XUo81gMc0iadYNU_ZxFRU) extension pada browser.


```mermaid
 classDiagram
      Employee <|-- SalariedEmployee
      Employee <|-- HourlyEmployee
      class Employee{
          <<abstract>>
          -String name 
          -String afm 
          +setName(string n)
          +String getName()
          +setAfm(String a)
          +String getAfm()
          +abstract payment()


      }
      class SalariedEmployee{
          -int salary
          +setSalary(int s)
          +int payment()
      }
      class HourlyEmployee{
          -int hoursWorked
          -int hourlyPayment
          +setHoursWorked(int hw)
          +getHoursWorked()
          +sethourlyPayment(int hp)
          +gethourlyPayment()
          +int payment()
      
      }
```
#
## REFRENCE
#### Dalam pembuatan program ini kami menambahkan class MultiInputPanel yang mana class tersebut child class tambahan dari library JOptionPane.
###
#### Class MultiInputPanel memiliki fungsi yaitu dapat memunculkan panel program seperti JOptionPane akan tetapi perbedaannya yaitu class ini dapat memiliki beberapa input dalam satu panel.
###
###  SOURCE MultiInputPanel

>- `Sumber library` : [KLIK DISINI](http://www.cs.gordon.edu/courses/cs211/AddressBookExample/Code.html)
>- `Dokumentasi` : [KLIK DISINI](http://www.cs.gordon.edu/courses/cs211/AddressBookExample/Javadoc/MultiInputPane.html#method_summary)

