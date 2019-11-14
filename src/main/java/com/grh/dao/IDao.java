package com.grh.dao;

import java.sql.SQLException;
import java.util.List;

/**
 * @author Yassine
 *
 * @param <T> la class dont la couche DAO
 */
public interface IDao<T> {
	
	/**
	 * @param nbrows nember de ligne a selectione
	 * @return	la liste d T selectione
	 * @throws SQLException 
	 */
	public List<T> select(int nbrows) throws SQLException;
	/**
	 * @param t l'objet a ajouter
	 * 
	 * @return boolean si l'objet est ajoute ou non
	 */
	public boolean ajouter(T t);
	public boolean modifier(T t);
	public boolean suprimer(T t);
	

}
