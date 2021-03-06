package net.sf.classifier4J;

import java.util.Collections;
import java.util.Set;

public class SetStopWordProvider<W> implements IStopWordProvider<W> {

	protected final Set<W> stopWords;
	
	public SetStopWordProvider(Set<W> stopWords) {
		if (stopWords == null) {
			throw new NullPointerException();
		}
		
		this.stopWords = Collections.unmodifiableSet(stopWords);
	}
	
	@Override
	public boolean isStopWord(W word) {
		return stopWords.contains(word);
	}

	@Override
	public String toString() {
		return this.getClass().getName() + ": <" + stopWords.size() + " words>";
	}
}
