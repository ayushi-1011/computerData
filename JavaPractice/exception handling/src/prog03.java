public class prog03{
	int hr;
	public void setHr(int hr) throws Exception {
		if( hr<0 || hr>23 )
			throw new Exception("hrs is in valid");
		this.hr=hr;
	}
	@Override
	public String toString() {
		return "time:"+hr;
		
	}
}