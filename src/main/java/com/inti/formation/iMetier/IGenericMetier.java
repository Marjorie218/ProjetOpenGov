package com.inti.formation.iMetier;

import java.util.List;

public interface IGenericMetier<G> {
	public void save(G g);
	public void update(G g);
	public void delete(int id);
	public G getOne(int id);
	public List<G> getAll();
}
