import cv2
import numpy as np

# Load the input image
image = cv2.imread('Assets/j.png')

# Convert to grayscale (must be done before thresholding)
grayImage1 = cv2.cvtColor(image, cv2.COLOR_BGR2GRAY)
# Get the dimensions
height, width, channels = image.shape
print('The image is {} pixels wide and {} pixels high.'.format(width, height))

# Load the input image
image2 = cv2.imread('Assets/jWithDots.png')
# Convert to grayscale (must be done before thresholding)
grayImage2 = cv2.cvtColor(image2, cv2.COLOR_BGR2GRAY)
# Perform the resizing so all the images are the same size.
grayImage2 = cv2.resize(grayImage2, (112, 150), interpolation=cv2.INTER_LINEAR)

# Load the input image
image3 = cv2.imread('Assets/jWithHoles.png')
# Convert to grayscale (must be done before thresholding)
grayImage3 = cv2.cvtColor(image3, cv2.COLOR_BGR2GRAY)
# Perform the resizing so all the images are the same size.
grayImage3 = cv2.resize(grayImage3, (112, 150), interpolation=cv2.INTER_LINEAR)


# Creating a kernel for operations
kernel = np.ones((5,5), np.uint8)

# Image Dilation
dilated_image = cv2.dilate(grayImage1, kernel, iterations=1)
# Dilation makes the bright areas in the image larger and darker areas smaller, making shapes more pronounced.

# Image Erosion
eroded_image = cv2.erode(grayImage1, kernel, iterations=1)
# Erosion does the opposite of dilation, making the bright areas smaller and dark areas larger, which can remove small noise.

# Image Opening
opened_image = cv2.morphologyEx(grayImage2, cv2.MORPH_OPEN, kernel)
# Opening is erosion followed by dilation. It's useful for removing noise and preserving the shape of objects.

# Image Closing
closed_image = cv2.morphologyEx(grayImage3, cv2.MORPH_CLOSE, kernel)
# Closing is dilation followed by erosion. It's useful for closing small holes and gaps in objects.

# Display the images
cv2.imshow('Original Image', grayImage1)
cv2.imshow('Dilated Image', dilated_image)
cv2.imshow('Eroded Image', eroded_image)
cv2.imshow('Opened Image', opened_image)
cv2.imshow('Closed Image', closed_image)

cv2.waitKey(0)
cv2.destroyAllWindows()