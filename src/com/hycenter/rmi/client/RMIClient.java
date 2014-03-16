package com.hycenter.rmi.client;

import java.rmi.Naming;
import java.util.List;

import com.hycenter.rmi.server.interfaces.IPersonService;
import com.hycenter.rmi.server.model.PersonEntity;

public class RMIClient {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try{
    		//调用远程对象，注意RMI路径与接口必须与服务器配置一致
    		IPersonService personService=(IPersonService)Naming.lookup("rmi://127.0.0.1:6600/IPersonService");
    		List<PersonEntity> personList=personService.GetList();
    		System.out.println("rmi client println---begin>>>>>>>>>>>\n");
    		for(PersonEntity person:personList){
    			System.out.println("ID:"+person.getId()+" Age:"+person.getAge()+" Name:"+person.getName());
    		}
    		System.out.println("rmi client println---end>>>>>>>>>>>\n");
    	}catch(Exception ex){
    		ex.printStackTrace();
    	}

	}

}
