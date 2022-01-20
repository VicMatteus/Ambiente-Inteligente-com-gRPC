public class Sprinkler
{
	private boolean estado;
	
	public Sprinkler()
	{
		this.estado = false;
	}
	
	public boolean ligarSprinkler()
	{
		if(!this.isEstado())
		{
			this.setEstado(true);
			return true;
		}
		else
		{
			return false;
		}
	}
	public boolean desligarSprinkler()
	{
		if(this.isEstado())
		{
			this.setEstado(false);
			return true;
		}
		else
		{
			return false;
		}
	}
	
	public boolean isEstado()
	{
		return estado;
	}
	public void setEstado(boolean estado)
	{
		this.estado = estado;
	}
	
}
