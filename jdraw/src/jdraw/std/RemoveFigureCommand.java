/*
 * Copyright (c) 2000-2008 Fachhochschule Nordwestschweiz (FHNW)
 * All Rights Reserved. 
 */

package jdraw.std;

import jdraw.framework.DrawCommand;
import jdraw.framework.DrawModel;
import jdraw.framework.Figure;

/**
 * Removes a figure from the drawing model. This removal can be undone.
 * @author Christoph Denzler
 *
 */
public class RemoveFigureCommand implements DrawCommand {
	/** The model from which to remove the figure. */
	private DrawModel model;
	/** The figure to remove. */
	private Figure    figure;

	/** To remove a figure we must know its identity and the model from which it should be removed.
	 * 
	 * @param m the model from which to remove the figure.
	 * @param f the figure to remove.
	 */
	public RemoveFigureCommand(DrawModel m, Figure f) {
		this.model = m;
		this.figure = f;
	}

	/**
	 * Remove the figure from the model. Does nothing if the figure was already removed.
	 */
	public void redo() {
		model.removeFigure(figure);
	}

	/**
	 * Add a removed figure again the the model. <b>Note:</b> This implementation does not test if the figure
	 * is already contained in the model. It assumes that the model implements set semantics concerning addition of
	 * figures, i.e. the same figure can be added repeatedly without affecting the figure list of the model.
	 */
	public void undo() {
		model.addFigure(figure);
	}

}

