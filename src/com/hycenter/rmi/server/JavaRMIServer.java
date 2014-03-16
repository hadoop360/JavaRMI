package com.hycenter.rmi.server;

import java.rmi.Naming;
import java.rmi.registry.LocateRegistry;

import com.hycenter.rmi.server.impl.PersonServiceImpl;
import com.hycenter.rmi.server.interfaces.IPersonService;

public class JavaRMIServer {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String host ="127.0.0.1";
		String port = "6600";
		 
		
		 try {
			 IPersonService personService=new PersonServiceImpl();
				//注册通讯端口
				LocateRegistry.createRegistry(Integer.valueOf(port));
				//注册通讯路径
				Naming.rebind("rmi://"+host+":"+port+"/IPersonService", personService);
				System.out.println("RMI Service Start!");
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

	}

}
