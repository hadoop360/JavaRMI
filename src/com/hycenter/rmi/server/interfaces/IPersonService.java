package com.hycenter.rmi.server.interfaces;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.List;
import com.hycenter.rmi.server.model.PersonEntity;

public interface IPersonService extends Remote{
	public List<PersonEntity> GetList() throws RemoteException; 
}
