package hgtest.storage.bje.DefaultIndexImpl;


import org.hypergraphdb.storage.bje.DefaultIndexImpl;
import org.powermock.api.easymock.PowerMock;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

/**
 * @author Yuriy Sechko
 */
public class DefaultIndexImpl_getNameTest extends DefaultIndexImplTestBasis
{
	@Test
	public void nameIsNull() throws Exception
	{
		PowerMock.replayAll();
		final DefaultIndexImpl index = new DefaultIndexImpl(null, storage,
				transactionManager, keyConverter, valueConverter, comparator, null);

		final String actual = index.getName();

		assertNull(actual);
	}

	@Test
	public void nameIsNotNull() throws Exception
	{
		final String expected = "some index name";

		PowerMock.replayAll();
		final DefaultIndexImpl index = new DefaultIndexImpl("some index name",
				storage, transactionManager, keyConverter, valueConverter,
				comparator, null);

		final String actual = index.getName();

		assertEquals(actual, expected);
	}
}
