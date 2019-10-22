package com.inti.formation.IMetier;

import java.util.List;

public interface IGenericMetier<G> {
	public void save(G g);
	public void update(G g);
	public void delete(Long id);
	public G getOne(Long id);
	public List<G> getAll();
}
