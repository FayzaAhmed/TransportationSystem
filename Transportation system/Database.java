import java.util.ArrayList;

public interface Database {
  public void addUser(Account account);
  public void addRide(IRide ride);
  public void addAreas(ArrayList<String> area); //neeeeeeeeeeeew
  public void removeUser(Account account);
  public void removeRide(IRide ride);


  public ArrayList<Driver> getDrivers();
  public ArrayList<Client> getClients();
  public ArrayList<Ride> getRides();
  public ArrayList<Driver> getPendingDriverList();

  public ArrayList<String> getAreas();
  public Admin getAdmin();

}
