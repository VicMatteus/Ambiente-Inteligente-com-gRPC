public class Lampada
{
	private boolean estado;
	
	public Lampada()
	{
		this.estado = false;
	}
	
	public boolean ligarLampada()
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
	public boolean desligarLampada()
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
