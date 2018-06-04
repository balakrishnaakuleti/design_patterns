import java.util.ArrayList;
import java.util.Iterator;

public class SongGroup extends SongComponent{

	private String groupName;
	private String groupDesc;
	ArrayList list;
	
	public SongGroup(String groupName, String groupDesc){
		this.groupName=groupName;
		this.groupDesc=groupDesc;
		list= new ArrayList<>();
	}
	
	public void addComponent(SongComponent songComponent) {
		list.add(songComponent);
	}

	public void removeComponent(SongComponent songComponent) {
		
		list.remove(songComponent);
	}

	public SongComponent getComponent(int index) {
		return (SongComponent)list.get(index);
	}
	
	public String getGroupName() {
		return groupName;
	}
	public void setGroupName(String groupName) {
		this.groupName = groupName;
	}
	public String getGroupDesc() {
		return groupDesc;
	}
	public void setGroupDesc(String groupDesc) {
		this.groupDesc = groupDesc;
	}
	
	@Override
	public void displaySongComponent() {

		System.out.println("Group Name: "+groupName+"    Group Description: "+groupDesc);
		Iterator iterator = list.iterator();
		
		while(iterator.hasNext()){
			SongComponent songComponent = (SongComponent)iterator.next();
			songComponent.displaySongComponent();
		}
		
	}
	
}
