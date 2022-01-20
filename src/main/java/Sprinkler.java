public class Sprinkler extends Thread
{
	private boolean estado;
	
	public Sprinkler()
	{
		this.estado = false;
		this.start();
	}
	@Override
	public void run()//para poder mudar a informação no sevidor
	{
		while(true)
		{
			System.out.println("Estado da Sprinkler:" +  this.isEstado());
			try
			{
				Thread.sleep(9000);
			}
			catch(InterruptedException e)
			{
				e.printStackTrace();
			}
		}
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
