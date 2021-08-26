controlador de pacote ;
public  class  ThreadId  extends  Thread {
	 id longo privado ;
	@SuppressWarnings ( " não utilizado " )
	 ThreadId privado ( id longo  ) {
		isso . id = id;
	}
	public  ThreadId () {
		// TODO stub do construtor gerado automaticamente
	}
	public  void  run () {
		getThreadId ();


	}
	private  void  getThreadId () {
		// TODO stub do método gerado automaticamente
		id = getId ();
		Sistema . para fora . println ( " TID ----> " + id);
	}

}