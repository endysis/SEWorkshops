// Account & DB

public interface AccountI {
	public UserDetails getUserDetails();
	public DataNode getUserDataInfo();
}

public interface UserDetails {
	public getUserDetails();
}

public interface DataNode{
	public updateDataNode(DataNode d);
	public DataNode getDataNode();
}