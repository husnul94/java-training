interface Modem {

  public boolean open();                               
  public boolean close();
  public int read ();
  public int write();

}

//..................................................................

class MindStickModem implements Modem {

                     public boolean open() {

                             System.out.println ( "Started a MindStickModem");
				return true;

                     }

                     public boolean close() {

                             System.out.println ( "Closed a MindStickModem");
				return false;

                     }

                     public int read() {

                             System.out.println ( "Reading a MindStickModem way");
				return 100;

                     }

                     public int write() {

                             System.out.println ( "Writing a MindStickModem way");
				return 100;

                     }

}


class HuaweiModem implements Modem {

                     public boolean open() {

                             System.out.println ( "Started a HuaweiModem ");
				return true;

                     }

                     public boolean close() {

                             System.out.println ( "Closed a HuaweiModem ");
				return false;

                     }

                     public int read() {

                             System.out.println ( "Reading a HuaweiModem way");
				return 200;

                     }

                     public int write() {

                             System.out.println ( "Writing a HuaweiModem way");
				return 200;

                     }

}



public class ModemTesting {

	public static void main (String args[]) {

	Modem MindStickModem = new MindStickModem ();
	MindStickModem.open();
	MindStickModem.write();
	MindStickModem.read();

	MindStickModem.close();

	Modem HuaweiModem = new HuaweiModem ();
	HuaweiModem.open();
	HuaweiModem.write();
	HuaweiModem.read();

	HuaweiModem.close();
    }
}
 

	