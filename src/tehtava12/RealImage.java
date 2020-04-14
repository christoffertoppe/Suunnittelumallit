package tehtava12;

public class RealImage implements Image{
	
	private final String filename;
	
    public RealImage(String filename) {
        this.filename = filename;
        loadImageFromDisk();
    }

    private void loadImageFromDisk() {
        System.out.println("Loading   " + filename);
    }
	
	@Override
	public void displayImage() {
		// TODO Auto-generated method stub
		System.out.println("Displaying " + filename);
		
	}

	@Override
	public void showData() {
		// TODO Auto-generated method stub
		System.out.println(filename);
	}

}
