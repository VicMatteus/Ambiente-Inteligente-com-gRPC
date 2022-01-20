public class Lampada extends Thread
{
	private boolean estado;
	
	public Lampada()
	{
		this.estado = false;
		this.start();
	}
	@Override
	public void run()//para poder mudar a informação no sevidor
	{
		while(true)
		{
			System.out.println("Estado da lâmpada:" +  this.isEstado());
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
